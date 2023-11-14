import codecs
import sys


def print_task(task_id, replace=False):
    humaneval = {}
    fp = codecs.open('../../../../HumanEval.jsonl', 'r', 'utf-8')
    for l in fp.readlines():
        l = eval(l)
        humaneval[int(l['task_id'].split('/')[1])] = l
    fp.close()
    data = humaneval[task_id]
    print('Task id:', task_id)
    print(data['prompt'] + data['canonical_solution'])
    if replace:
        print(data['test'].replace("'", '"'))
    else:
        print(data['test'])


if __name__ == '__main__':
    print_task(int(sys.argv[1]), bool(sys.argv[2]) if len(sys.argv) > 2 else False)
