n=int(input())
i=1
sumaPo=0
sumaCa=0
catSapto=0
catMoapto=0
catMarapto=0
catNoapto=0

def promedio():
    promPo = sumaPo/n
    promCa = sumaCa/n
    print (f"{promPo:.2f}")
    print (f"{promCa:.2f}")

def categorias():
    print("sumamente apto", catSapto)
    print("moderadamente apto", catMoapto)
    print("marginalmente apto", catMarapto)
    print("no apto", catNoapto)

while (i <= n):
    po = float(input())
    sumaPo += po
    ca = float(input())
    sumaCa += ca
    i += 1

    if po > 69 and ca >= 2 and ca <= 4:
        catSapto += 1
    elif po > 69 and ca > 4 and ca <= 8:
        catMoapto += 1
    elif po > 69 and ca > 8 and ca <= 12:
        catMarapto += 1
    elif po > 69 and ca < 2 or ca > 12:
        catNoapto += 1
    elif po >= 58 and ca >= 2 and ca <= 4:
        catMoapto += 1
    elif po >= 58 and ca > 4 and ca <= 8:
        catMoapto += 1
    elif po >= 58 and ca > 8 and ca <= 12:
        catMarapto += 1
    elif po >= 58 and ca < 2 or ca > 12:
        catNoapto += 1
    elif po >= 46 and ca >= 2 and ca <= 4:
        catMarapto += 1
    elif po >= 46 and ca > 4 and ca <= 8:
        catMarapto += 1 
    elif po >= 46 and ca > 8 and ca <= 12:
        catMarapto += 1
    elif po >= 46 and ca < 2 or ca > 12:
        catNoapto += 1
    else :
        catNoapto += 1
        
promedio()
categorias()