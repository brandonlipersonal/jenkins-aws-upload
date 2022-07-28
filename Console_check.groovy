node {
  def consoleCheck = sh returnStdout: true, script:  """  
                                                      if ( [ -s console.log ] );
                                                      then
                                                      echo -n "true";
                                                      fi
   
                                                  """
  stage('Console Check') {
    println(consoleCheck)
     if (consoleCheck == "true") 
     {
       echo "Console Log exists"
     } 
  }
}
