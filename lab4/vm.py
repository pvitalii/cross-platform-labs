command_pointer = 0

bytecode = [0x00,
           0x01, 0x00, 0x03,
           0x02, 0x00,
           0x04, 0x00, 0x03,
           0x01, 0x01, 0x02,
           0x03, 0x00, 0x01]

# Registers
R = [0]*16

# Stack
S = [0]*16

def get_op():
 global command_pointer
 ret  = bytecode[command_pointer]
 command_pointer = command_pointer + 1
 return ret

while (command_pointer < len(bytecode)):
 command = bytecode[command_pointer]
 command_pointer = command_pointer + 1
 print ("Command: ", str(command))

 # idle
 if (command == 0x00):
   #idle
   continue

 # LOAD R(op1) = op2
 if (command == 0x01):
   op1 = get_op()
   op2 = get_op()

   R[op1] = op2
   print ("R[", op1, "]: ", R[op1])

   continue

 # INC R(op)
 if (command == 0x02):
   op = get_op()
   R[op] += 1
   print ("R[", op, "]: ", R[op])
   continue

 # ADD, R(op1) = R(op1) + R(op2)
 if (command == 0x03):
   op1 = get_op()
   op2 = get_op()

   R[op1] = R[op1] + R[op2]
   print ("R[", op1, "]: ", R[op1])
   continue

 # if (OP1 == 0) then JMPF (OP2)
 if (command == 0x04):
   op1 = get_op()
   op2 = get_op()

   print ("Op1 :", op1)
   print ("Op2 :", op2)

   if (op1 == 0):
     command_pointer += op2
   continue