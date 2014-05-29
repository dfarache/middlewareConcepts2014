export JACORB_HOME=/opt/JacORB
export PATH=$PATH:/home/dafarache/NetBeansProjects/MwC_Assignment3/lib/jacorb-3.4/bin
export PATH=$PATH:$/home/dafarache/NetBeansProjects/MwC_Assignment3/lib/jacorb-3.4/lib
export CLASSPATH=".;$/home/dafarache/NetBeansProjects/MwC_Assignment3/lib/jacorb-3.4/lib/jacorb.jar"
export JACORB_HOME=/home/dafarache/NetBeansProjects/MwC_Assignment3/lib/jacorb-3.4

cd ./build/classes 
jaco mwc_assignment3.MwC_Assignment3 $1 $2



