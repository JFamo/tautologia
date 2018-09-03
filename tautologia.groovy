//Take Input
def inputPane = javax.swing.JOptionPane.&showInputDialog
def input = inputPane 'Enter your text :'
assert input.length() > 0 : "Empty input"
assert input.length() < 1000000 : "Input too long"

//Repeat Input
println "Got input : $input"

//Split into List
def content = input.split(" ")

println "$content"