# #1
# terms = []
#
# for x in [0, 1]:
#     for y in [0, 1]:
#         f = (not x) or y
#         if f:
#             term = []
#             term.append("¬x" if x == 0 else "x")
#             term.append("¬y" if y == 0 else "y")
#             terms.append(" ∧ ".join(term))
#
# dnf = " ∨ ".join(terms)
# print(dnf)

# #2
# clauses = []
#
# for x in [0, 1]:
#     for y in [0, 1]:
#         f = x and (not y)
#         if not f:
#             clause = []
#             clause.append("x" if x == 0 else "¬x")
#             clause.append("y" if y == 0 else "¬y")
#             clauses.append("(" + " ∨ ".join(clause) + ")")
#
# knf = " ∧ ".join(clauses)
# print(knf)

# #3
# def dnf():
#     terms = []
#
#     for x in [0, 1]:
#         for y in [0, 1]:
#             f = (not x) or y
#             if f:
#                 term = []
#                 term.append("¬x" if x == 0 else "x")
#                 term.append("¬y" if y == 0 else "y")
#                 terms.append(" ∧ ".join(term))
#
#     dnf = " ∨ ".join(terms)
#     print(dnf)
# def knf():
#     clauses = []
#
#     for x in [0, 1]:
#         for y in [0, 1]:
#             f = x and (not y)
#             if not f:
#                 clause = []
#                 clause.append("x" if x == 0 else "¬x")
#                 clause.append("y" if y == 0 else "¬y")
#                 clauses.append("(" + " ∨ ".join(clause) + ")")
#
#     knf = " ∧ ".join(clauses)
#     print(knf)
#4
# import itertools
#
# def auto_dnf(func):
#     vars = ['x', 'y']
#     res = []
#     for v in itertools.product([False, True], repeat=2):
#         env = dict(zip(vars, v))
#         if func(**env):
#             res.append("(" + " ∧ ".join([var if val else f"¬{var}" for var, val in zip(vars, v)]) + ")")
#     return " ∨ ".join(res) if res else "False"
#
# print(auto_dnf(lambda x, y: x != y))

#5
# import itertools
#
# def auto_cnf(func):
#     vars = ['x', 'y', 'z']
#     res = []
#     for v in itertools.product([False, True], repeat=3):
#         env = dict(zip(vars, v))
#         if not func(**env):
#             res.append("(" + " ∨ ".join([f"¬{var}" if val else var for var, val in zip(vars, v)]) + ")")
#     return " ∧ ".join(res) if res else "True"
#
# print(auto_cnf(lambda x, y, z: (x and y) or z))

# #6
# import itertools
#
# def check_equiv(f1, f2, vars):
#     for v in itertools.product([False, True], repeat=len(vars)):
#         env = dict(zip(vars, v))
#         if f1(**env) != f2(**env):
#             return False
#     return True
#
# f1 = lambda x, y: (not x) or y
# f2 = lambda x, y: (not x) <= (not y)
# print(check_equiv(f1, f2, ['x', 'y']))