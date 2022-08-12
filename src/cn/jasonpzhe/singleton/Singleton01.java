package cn.jasonpzhe.singleton;/**
 *
 **/

/**
 * @description: ¶öººÊ½
 *
 * @author: zhe.pan
 *
 * @create: 2022-08-11
 **/
public class Singleton01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getSingleton();
        Singleton singleton2 = Singleton.getSingleton();
        System.out.println(singleton1 == singleton2);
        System.out.println(singleton1.hashCode()+";"+singleton2.hashCode());

    }

}
    class Singleton{
        private Singleton(){
        }

        // static Singleton s = new Singleton();
        private static final Singleton S = new Singleton();

        public static Singleton getSingleton(){
            return S;
        }
    }

