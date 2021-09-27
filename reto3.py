z = int(input())
i = 1

listaF_Po = []
listaF_Ca = []
catSapto = 0
catMoapto = 0
catMarapto = 0
catNoapto = 0

def categorias():
    print("sumamente apto", catSapto)
    print("moderadamente apto", catMoapto)
    print("marginalmente apto", catMarapto)
    print("no apto", catNoapto)

while (i <= z):
    L_po = []
    L_ca = []
    po = list(map(float,input().split(" ")))
    ca = list(map(float,input().split(" ")))
        
    promPo = sum(po) / len(po)
    promCa = sum(ca) / len(ca)

    L_po.append(promPo)
    L_ca.append(promCa)

    listaF_Po.append(f"{promPo:.2f}")
    listaF_Ca.append(f"{promCa:.2f}")

    i += 1

    if promPo > 69 and promCa >= 2 and promCa <= 4:
        catSapto += 1
    elif promPo > 69 and promCa > 4 and promCa <= 8:
        catMoapto += 1
    elif promPo > 69 and promCa > 8 and promCa <= 12:
        catMarapto += 1
    elif promPo > 69 and promCa < 2 or promCa > 12:
        catNoapto += 1
    elif promPo > 57 and promCa >= 2 and promCa <= 4:
        catMoapto += 1
    elif promPo > 57 and promCa > 4 and promCa <= 8:
        catMoapto += 1
    elif promPo > 57 and promCa > 8 and promCa <= 12:
        catMarapto += 1
    elif promPo > 57 and promCa < 2 or promCa > 12:
        catNoapto += 1
    elif promPo >= 46 and promCa >= 2 and promCa <= 4:
        catMarapto += 1
    elif promPo >= 46 and promCa > 4 and promCa <= 8:
        catMarapto += 1 
    elif promPo >= 46 and promCa > 8 and promCa <= 12:
        catMarapto += 1
    elif promPo >= 46 and promCa < 2 or promCa > 12:
        catNoapto += 1
    else :
        catNoapto += 1

print(' '.join(listaF_Po))
print(' '.join(listaF_Ca))
categorias()