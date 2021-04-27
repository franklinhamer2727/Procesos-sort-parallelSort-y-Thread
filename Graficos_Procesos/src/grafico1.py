# importing the required module
from matplotlib import pyplot as plt
fig, ax=plt.subplots()
datos = [10,100,1000,10000,100000,1000000,10000000,100000000]
tiempo = [1763800,1835000,2023300,7320400,53887200,407753000,453975500,1324204200]
datos1 =[10,
100,
1000,
10000,
100000,
10000000,
100000000 ]
tiempo1 =[281400,
356400,
554200,
3940600,
40404400,
693872400, 
6998505200 ]
ax.plot(datos,tiempo)
ax.plot(datos1,tiempo1)
plt.ylim(10000000,1500000000)
plt.title("Graficos de los tiempos de ejecución de short() vs parallelSort()\n")
plt.ylabel("Numero de datos")
plt.xlabel("Tiempo en nanosegundos")
plt.show()

