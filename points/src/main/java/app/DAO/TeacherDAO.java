package app.DAO;

import app.entities.Teacher;
import jakarta.persistence.EntityManagerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeacherDAO implements GenericDAO<Teacher, Integer> {
    private final List<Teacher> teachers = new ArrayList<>();

    private static EntityManagerFactory emf;
    private static TeacherDAO instance;

    private TeacherDAO(){}

    public static TeacherDAO getInstance(EntityManagerFactory _emf){
        if(emf == null){
            emf = _emf;
            instance = new TeacherDAO();
        }
        return instance;
    }

    @Override
    public void save(Teacher entity)
    {

    }

    @Override
    public Optional<Teacher> findById(Integer integer)
    {
        return Optional.empty();
    }

    @Override
    public List<Teacher> findAll()
    {
        return List.of();
    }

    @Override
    public void update(Teacher entity)
    {

    }

    @Override
    public void delete(Integer integer)
    {

    }
}
