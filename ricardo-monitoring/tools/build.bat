REM Build Ricardo Monitoring Windows

maven\apache-maven-3.6.0-bin\apache-maven-3.6.0\bin\mvn -f ..\pom.xml clean package

echo "Build generated in ricardo-monitoring/target as ricardo-monitoring.war"