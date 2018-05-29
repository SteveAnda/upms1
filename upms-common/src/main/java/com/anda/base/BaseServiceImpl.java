package com.anda.base;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 实现BaseService抽象类
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example>{

    public Mapper mapper;


    @Override
    public int countByExample(Example example) {
        try {
            Method countByExample = mapper.getClass().getDeclaredMethod("countByExample",example.getClass());
            Object result = countByExample.invoke(mapper, example);
            return (Integer)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public Record selectByPrimaryKey(Integer id) {
        try {
            Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey",id.getClass());
            Object result = selectByPrimaryKey.invoke(mapper, id);
            return (Record)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public List<Record> selectByExample(Example example) {
        try{
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample",example.getClass());
            Object result = selectByExample.invoke(mapper, example);
            return (List<Record>)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Record selectFirstByExample(Example example) {
        Method selectByExample = null;
        try {
            selectByExample = mapper.getClass().getDeclaredMethod("selectByExample",example.getClass());
            List<Record> result = (List<Record>)selectByExample.invoke(mapper, example);
            if(null != result && result.size() > 0){
                return result.get(0);
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public int insert(Record record) {

        try {
            Method insert =  mapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(mapper, record);
            return (Integer)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertSelective(Record record) {

        try {
            Method insertSelective =  mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
            Object result = insertSelective.invoke(mapper, record);
            return (Integer)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {

        try {
            Method deleteByPrimaryKey =  mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
            Object result = deleteByPrimaryKey.invoke(mapper, id);
            return (Integer)result;

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKeys(String ids) {
        /*
         * 目标：批量删除对象
         * 1.分割取出ids
         * 2.调用循环删除
         * 3.返回结果
         */
        if (null == ids || "".equals(ids) )
            return 0;
        String[] strIds = ids.split("-");
        if (null == strIds || strIds.length == 0)
            return 0;
        //获取删除的方法
        try {
            Method deleteByPrimaryKey =  mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", Integer.class);
            for (String id : strIds){
                int result = 0;
                result += (Integer)deleteByPrimaryKey.invoke(mapper, Integer.parseInt(id));
                return result;
            }

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByExample(Example example) {

        try {
            Method deleteByExample = mapper.getClass().getDeclaredMethod("deleteByExample", example.getClass());
            Object result = deleteByExample.invoke(mapper, example);
            return (Integer)result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Record record) {

        try {
            Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
            Object result = updateByPrimaryKey.invoke(mapper, record);
            return (Integer)result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {

        try {
            Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
            Object result = updateByPrimaryKeySelective.invoke(mapper, record);
            return (Integer)result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByExample(Record record, Example example) {

        try {
            Method updateByExample = mapper.getClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
            Object result = updateByExample.invoke(mapper, record, example);
            return (Integer)result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByExampleSelective(Record record, Example example) {
        try {
            Method updateByExampleSelective = mapper.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
            Object result = updateByExampleSelective.invoke(mapper, record, example);
            return (Integer)result;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
