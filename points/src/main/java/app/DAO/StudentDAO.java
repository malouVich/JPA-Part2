package app.DAO;

import app.entities.Student;
import jakarta.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentDAO implements GenericDAO<Student, Integer> {
    private final List<Student> students = new ArrayList<>();

    private static EntityManagerFactory emf;
    private static StudentDAO instance;

    private StudentDAO(){}

    public static StudentDAO getInstance(EntityManagerFactory _emf){
        if(emf == null){
            emf = _emf;
            instance = new StudentDAO();
        }
        return instance;
    }

    @Override
    public void save(Student entity)
    {

    }

    @Override
    public Optional<Student> findById(Integer integer)
    {
        return Optional.empty();
    }

    @Override
    public List<Student> findAll()
    {
        return List.of();
    }

    @Override
    public void update(Student entity)
    {

    }

    @Override
    public void delete(Integer integer)
    {

    }
}
