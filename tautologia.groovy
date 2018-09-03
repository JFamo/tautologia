//Take Input
def inputPane = javax.swing.JOptionPane.&showInputDialog
def input = inputPane 'Enter your text :'
assert input.length() > 0 : "Empty input"
assert input.length() < 1000000 : "Input too long"

//Repeat Input
println "Got input : $input"

//Split into List
def content = [];
content = input.split(" ") as List

//Standardize List Data
    //remove blank chars and spaces
content.removeAll{ it.trim().length() <= 0 }
    //replace spaces
content = content*.replaceAll(" ","")
    //make lower case
content = content*.toLowerCase()
    //replace non alpha numeric
content = content*.replaceAll("[^a-z0-9]","")


println "$content"