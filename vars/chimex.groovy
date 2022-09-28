def call(stagename){

if ("${stagename}" == "Build")
{
sh "mvn clean package"
}
}
