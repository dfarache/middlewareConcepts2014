echo "Please add me as so:"
echo
echo "source $0"
echo

export ANT_HOME=$(pwd)/lib/apache-ant-1.9.0
export JACORB_HOME=$(pwd)/lib/jacorb-3.4
export PATH=$ANT_HOME/bin:$JACORB_HOME/bin:$PATH
export JAVA_HOME=$ANT_HOME:$JACORB_HOME:$JAVA_HOME
export CLASSPATH=$(pwd):$CLASSPATH

echo $PATH

nmg -ORBInitRef NameService=file:/home/dafarache/NS_Ref
