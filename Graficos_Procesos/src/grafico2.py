from matplotlib import pyplot as plt

fig, ax=plt.subplots()
thread2 = [10,
100,
1000,
10000,
100000]
tiempo1 = [0.001,
0.002,
0.01,
0.117,
11.61]

thread4 = [10,
100,
1000,
10000,
100000]
tiempo2 = [0.001,
0.001,
0.015,
0.074,
5.718]

thread8 = [10,
100,
1000,
10000,
100000]
tiempo3 = [0.001,
0.001,
0.039,
0.058,
3.308]

thread16 = [10,
100,
1000,
10000,
100000]
tiempo4 = [0.001,			
0.002,
0.051,
0.068,
2.693]

thread32 = [10,
100,
1000,
10000,
100000]
tiempo5 = [0.002,		
0.003,
0.034,
0.062,
2.326			
]
ax.plot(thread2,tiempo1,label ="thread2", marker ="o", markersize ="8", markeredgewidth ="2",markerfacecolor="green", markeredgecolor="white")
ax.plot(thread4,tiempo2,label="thread4",marker="*", markersize="10", markeredgewidth="2",markerfacecolor="red", markeredgecolor="white")
ax.plot(thread8,tiempo3,label="thread8",marker="D", markersize="5", markeredgewidth="2",markerfacecolor="orange", markeredgecolor="white")
ax.plot(thread16,tiempo4,label="thread16",marker="*", markersize="8", markeredgewidth="2",markerfacecolor="yellow", markeredgecolor="white")
ax.plot(thread32,tiempo5,label="thread32",marker="*", markersize="10", markeredgewidth="2",markerfacecolor="blue", markeredgecolor="white")
plt.ylim(0,12)
plt.xlim(10,100000)
plt.title("Graficos de los tiempos de ejecución usando hilos ")
plt.ylabel("Tiempo en segundos")
plt.xlabel("Numero de Datos")
plt.legend()
plt.show()
