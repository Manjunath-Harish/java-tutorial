package com.man.collections.sets;

import com.sun.deploy.util.StringUtils;

import java.util.HashSet;
import java.util.Set;

public class GenericInSet {

  public static void main(String[] args) {
    Set<String> strings = new HashSet<>();
    strings.add("man");
    strings.add("ram");

    class User{
      User(String name,int id){
        this.name=name;
        this.id=id;
      }

      String name;
      int id;
    }
    User user1 = new User("man",1);
    User user2 = new User("raman",1);
    Set<User> users = new HashSet<>();
    users.add(user1);
    users.add(user2);
    convertSetToString(strings);
    convertSetToString(users);
  }

  public static String convertSetToString(Set<?> set) {
    String csv = null;
    if (null != set) {
      csv = StringUtils.join(set, ",");
    }
    System.out.println("Result : " + csv);
    return csv;
  }
}

