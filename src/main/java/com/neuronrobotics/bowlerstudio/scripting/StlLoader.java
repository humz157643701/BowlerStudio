package com.neuronrobotics.bowlerstudio.scripting;

import com.neuronrobotics.bowlerstudio.vitamins.Vitamins;
import eu.mihosoft.vrl.v3d.CSG;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class StlLoader implements IScriptingLanguage {

  @Override
  public Object inlineScriptRun(File code, ArrayList<Object> args) throws Exception {
    CSG sllLoaded = Vitamins.get(code);
    return sllLoaded;
  }

  @Override
  public Object inlineScriptRun(String code, ArrayList<Object> args) throws Exception {
    throw new RuntimeException("This engine only supports files");
  }

  @Override
  public String getShellType() {
    // TODO Auto-generated method stub
    return "Stl";
  }

  @Override
  public boolean getIsTextFile() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public ArrayList<String> getFileExtenetion() {
    // TODO Auto-generated method stub
    return new ArrayList<>(Arrays.asList("stl"));
  }
}
