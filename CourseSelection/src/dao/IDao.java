package dao;//Êý¾Ý²ã
import java.util.HashMap;
import entity.InterfaceEntity;
public interface IDao {
         void insert(InterfaceEntity entity) throws Exception;
         void delete() throws Exception;
         void update() throws Exception;
         public HashMap<String , InterfaceEntity> getAllEntities() throws Exception;
         public InterfaceEntity getEntity(String Id);
}
