package com.yllyx.clubs.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 基础公共Dao类
 * 
 * @author lyx
 * @param <T>
 * @param <PK>
 */
public class BasicDao<T, PK extends Serializable> implements IBasicDao<T, PK>
{
    protected Class<T> entityClass;

    @SuppressWarnings("unchecked")
    public BasicDao()
    {
        entityClass =
            (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    @Autowired
    private SessionFactory sessionFactory;

    /**
     * 获取当前线程的session
     * 
     * @return
     */
    private Session getCurrentSession()
    {
        return this.sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    public T load(PK id)
    {
        return (T)this.getCurrentSession().load(entityClass, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get(PK id)
    {
        return (T)this.getCurrentSession().get(entityClass, id);
    }

    @Override
    public List<T> findAll()
    {
        String sql = "select e from " + entityClass.getSimpleName() + " e";
        @SuppressWarnings("unchecked")
        List<T> list = this.getCurrentSession().createQuery(sql).list();
        return list != null ? list : null;
    }

    @Override
    public void persist(T entity)
    {
        this.getCurrentSession().persist(entity);
    }

    @SuppressWarnings("unchecked")
    @Override
    public PK save(T entity)
    {
        return (PK)this.getCurrentSession().save(entity).toString();
    }

    @SuppressWarnings("unchecked")
    @Override
    public PK merge(T entity)
    {
        return (PK)this.getCurrentSession().merge(entity);
    }

    @Override
    public void saveOrUpdate(T entity)
    {
        this.getCurrentSession().saveOrUpdate(entity);
    }

    @Override
    public void delete(T entity)
    {
        this.getCurrentSession().delete(entity);
    }

    @Override
    public void flush()
    {
        this.getCurrentSession().flush();
    }

}
