package org.opentutorials.javatutorials.accessmodifier.outer;
import org.opentutorials.javatutorials.accessmodifier.inner.*;

public class ClassAccessModifierOuterPackage {
    PublicClass publicClass = new PublicClass();
    // 접근 제어가 default이기 때문에 에러 발생
    //DefaultClass defaultClass = new DefaultClass();
}