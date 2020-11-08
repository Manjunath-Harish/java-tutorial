package com.man.accessmodifiers.finalKey;

public class FinalInstanceVariables {
  final String classId =  "FinalInstanceVariables";
}


class InstanceBlock {
  final String classId;

  {
    classId = "FinalInstanceVariables";
  }
/*  final String testing;
  testing = "asdfg";*/
}


class InsideConstructor {
  final String classId;

  InsideConstructor() {
    classId = "FinalInstanceVariables";
  }
}
