package dev;

import qa.QAClass;

 class DevClass extends QAClass {
    public static void main(String[] args){
        Devmethods();
    }

    public static void Devmethods(){
        QAClass qaClass = new QAClass();
        qaClass.QaMethod();
    }
}
