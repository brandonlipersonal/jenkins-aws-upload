node {
  def consoleCheck = sh returnStdout: false, script:  """  
                                                      if ( [ -s console.log ] )
                                                      then
                                                          echo 'true' 
                                                      elif [ -f console.log ]
                                                      then
                                                        echo 'null' 
                                                    else 
                                                        echo 'false' 
                                                    fi
                                                  """
  stage('Console Check') {
    println(consoleCheck)
    if (consoleCheck != "false") 
    {
      echo "Console Log exists"
    } 
  }
}
