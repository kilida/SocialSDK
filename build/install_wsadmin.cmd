call mvn install:install-file  -Dfile=../java/prereq/eclipse/plugins/com.ibm.sbt.libs.was/lib/com.ibm.ws.admin.core.jar -DgroupId=com.ibm.ws -DartifactId=com.ibm.ws.admin.core -Dversion=7.0.0 -Dpackaging=jar  
call mvn install:install-file  -Dfile=../java/prereq/eclipse/plugins/com.ibm.sbt.libs.was/lib/com.ibm.ws.admin.services.jar -DgroupId=com.ibm.ws -DartifactId=com.ibm.ws.admin.services -Dversion=7.0.0 -Dpackaging=jar 			  
call mvn install:install-file  -Dfile=../java/prereq/eclipse/plugins/com.ibm.sbt.libs.was/lib/com.ibm.ws.runtime.jar -DgroupId=com.ibm.ws -DartifactId=com.ibm.ws.runtime -Dversion=7.0.0 -Dpackaging=jar   
