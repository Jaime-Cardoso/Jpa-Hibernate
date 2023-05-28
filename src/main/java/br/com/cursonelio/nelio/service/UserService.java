package br.com.cursonelio.nelio.service;

import br.com.cursonelio.nelio.entities.User;
import br.com.cursonelio.nelio.repository.UserRepository;
import br.com.cursonelio.nelio.service.exeptions.DatabaseException;
import br.com.cursonelio.nelio.service.exeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj) {
        return userRepository.save(obj);
    }

    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
        User entitiy = userRepository.getReferenceById(id);
        updateData(entitiy, obj);
        return userRepository.save(entitiy);
    }

    private void updateData(User entitiy, User obj) {
        entitiy.setName(obj.getName());
        entitiy.setEmail(obj.getEmail());
        entitiy.setPhone(obj.getPhone());
    }
}
