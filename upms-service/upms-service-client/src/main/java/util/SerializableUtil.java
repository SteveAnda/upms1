package util;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.session.Session;

import java.io.*;

/**
 * session序列化工具
 */
public class SerializableUtil {

    public static String serialize(Session session){
        if (null == session){
            return null;
        }
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            // 暂时我不知道下面这两句什么意思，好像没有也行？
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(session);
            return Base64.encodeToString(bos.toByteArray());
        } catch (IOException e) {
            throw new RuntimeException("serialize session error", e);
        }
    }

    public static Session deserialize(String sessionStr){
        if (StringUtils.isBlank(sessionStr)){
            return null;
        }
        try {
            ByteArrayInputStream bis = new ByteArrayInputStream(Base64.decode(sessionStr));
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Session) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException("deserialize session error", e);
        }
    }
}
