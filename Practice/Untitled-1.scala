// 4. Crea un arreglo de numero en rango del 1-1000 en pasos de 5 en 5
Array.range(1, 1000,5)
// 5. Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos
val elementos = List(1,3,3,4,6,7,3,7)
elementos.toSet
val nuevoselementos = elementos.toSet

// 6. Crea una mapa mutable llamado nombres que contenga los siguiente 
// "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"
val mimapa = collection.mutable.Map(("Jose", 20), ("Luis", 24), ("Ana", 23), ("Susana","27"))

//  a . Imprime todas la llaves del mapa
mimapa.keys
//  b . Agrega el siguiente valor al mapa("Miguel", 23)
mimapa += ("Miguel" -> 23)