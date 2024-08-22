package GB_Homework.Model.Family_Tree;

import GB_Homework.Model.Human.Gender;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public interface ItemFamilyTree<E> extends Serializable {
    long getId();
    String getName();
    LocalDate getBirthDate();
    Gender getGender();
    E getMother();
    E getFather();
    List<E> getChildren();

    void setParent(E parentToUpdate);
    void setMother(E motherToUpdate);
    void addChild(E childToUpdate);
    void setFather(E fatherToUpdate);
}
