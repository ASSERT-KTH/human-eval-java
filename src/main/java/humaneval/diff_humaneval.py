import subprocess
import sys
import codecs


def command(cmd):
    process = subprocess.Popen(cmd, stdout=subprocess.PIPE, stderr=subprocess.PIPE)
    output, err = process.communicate()
    for l in str(output).split('\\n'):
        print(l)
    return output, err


def read_bugs():
    lst = []
    fp = codecs.open('humaneval_loc.txt', 'r', 'utf-8')
    for l in fp.readlines():
        l = l.strip().split()
        lst.append(l[0])
    return lst


if __name__ == '__main__':
    id = sys.argv[1]
    
    if '0' <= id[0] <= '9':
        lst = read_bugs()
        bug = lst[int(sys.argv[1])]
    else:
        bug = id.upper()
    
    print(bug)
    command([
        'diff', 'buggy/' + bug + '.java', 'correct/' + bug + '.java', '--unified=3'
    ])
