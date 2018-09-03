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

//Closure for Checking and Removing Empty List Items
def bumpEmpty = { item ->
    if(item.trim().length() <= 0){
        content.remove(item)
    }
}

//Standardize List Data
//remove blank chars and spaces
content.each{ bumpEmpty(it) }
content*.replace("\t","")
content*.toLowerCase()

println "$content"