# HumanEval-Java: Transformed Java Defects Dataset From [HumanEval](https://github.com/openai/human-eval)

This is an bug benchmark for evaluating automated program repair tools, including buggy and correct Java programs transformed from HumanEval dataset.

## Structure
```
.
├── lib
├── src
│   ├── main/java/humaneval
│   │   ├── buggy (buggy programs)
│   │   ├── correct (correct programs)
│   │   ├── humaneval_loc.txt (fault locations)
│   │   └── print_humaneval.py
|   |   └── diff_humaneval.py
|   |   └── mutation_operators.json
│   └── test/java/humaneval
│       └── junit test cases
└── target
```

## Usage
To run junit test cases on a buggy program, run:
```
mvn test -Dtest=TEST_{program_name}
```
This will run all the junit test cases on the given program under the **buggy** package.

## Mutation Operators
The list of mutation operators used to inject bugs, and the number of bugs each operators used. Each bug may involve multiple mutation operators.
```
condition branch addition, 25
loop condition modification, 25
condition expression modification, 24
variable modification, 24
return expression modification, 19
assignment expression modification, 18
method call addition, 15
math operator modification, 14
initialization modification, 14
method call parameter modification, 13
method call modification, 11
condition expression expansion, 8
assignment addition, 5
method call parameter addition, 4
type modification, 4
loop addition, 2
branch condition modification, 2
condition branch deletion, 2
condition branch modification, 2
declaration statement addition, 2
initialization addition, 1
method call parameter deletion, 1
try-catch statement addition, 1
break statement addition, 1
declaration statement deletion, 1
assignment statement deletion, 1
method call deletion, 1
```