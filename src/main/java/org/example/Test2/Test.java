package org.example.Test2;



import org.example.dao.Impl.StudentDAOImpl;
import org.example.dao.StudentDAO;
import org.example.pojo.Student;

import java.util.Date;

/** JDBC java
 * @author sunxin
 * @date 2024/7/22 上午9:26
 */
public class Test {

    public static void main(String[] args) {
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//        }catch (ClassNotFoundException e){
//            e.printStackTrace();
//        }
//        System.out.println("驱动加载成功");
////        获取jdbc连接
//        String url = "jdbc:mysql://localhost:3306/nuist?characterEncoding=utf8";
//        String username = "root";
//        String password = "a12345";
//        Connection connection= null;
//        try {
//            connection = DriverManager.getConnection(url, username, password);
//        }catch (SQLException e){
//            e.printStackTrace();
//        }
//        System.out.println("获取连接成功");
////        创建编译语句
//        try {
//            Statement s = connection.createStatement();
//            String sql = "insert into stu\n" +"(NAME,gender,brithday,addr,qqnumber)\n"+"VALUES\n"+
//                    "('计算','女','2003-09-11','江苏',315776018)";
////            运行sql语句
//            s.executeUpdate(sql);
//        }catch (SQLException e){
//            throw new RuntimeException(e);
////            驱动加载 获取连接 创建编译语句对象 执行语句
////            驱动加载 连接获取 创建编译语句对象 执行语句 获取查询结果集
//        }
        Student s1 = new Student(0,"今安徽","男",
                new Date(0),"南京", 1808L);
        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(s1);
        Student s2 = new Student(6,"不计算","男",
                new Date(),"扬州", 1808L);
        studentDAO.update(s2);
    }
}
