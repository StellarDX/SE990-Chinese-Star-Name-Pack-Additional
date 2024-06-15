// Object * 14 Cep  ---  Spectroscopic Binary  ---  OID=@120528   (@@7759,0)  ---  coobox=591 
// Object types: Ellipsoidal Variable,Spectroscopic Binary,Spectroscopic Binary,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "14 Cep A" {ParentBody "14 Cep"}
Remove "14 Cep B" {ParentBody "14 Cep"}
Star "14 Cep A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "Gaia DR3 2199161386015469312"
	Class           "O9III"
	AbsMagn         -4.67 // 计算的值
	MassSol         16.0
	RadSol          11.7
	LumBol          79000
	Teff            32000

	BinaryOrbit     
	{
		PeriodDays      3.070507
		Eccentricity    0.0
		Inclination     49
	}
}

Star "14 Cep B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "Gaia DR3 2199161386015469312"
	Class           "N9.7V" // ON9.7
	MassSol         6.5
	RadSol          9.4
	LumBol          45000
	Teff            28000
}

// Object HD 210220  ---  Star  ---  OID=@158445   (@@7264,2)  ---  coobox=624 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "HD 210220 A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "HD 210220"
	Class           "G6III"
	AbsMagn         -0.3
	MassSol         2.97
	Teff            5261
	Age             0.35

	BinaryOrbit     
	{
		PeriodDays      737.4
		Eccentricity    0.308
		Epoch           2454113.3
		ArgOfPericenter 241.9
		MeanAnomaly     0
	}
}

Star "HD 210220 B"
{
	ParentBody      "HD 210220"
	Class           "A5.5?"
}

// Object * 15 Cep  ---  Double or Multiple Star  ---  OID=@158531   (@@7305,13)  ---  coobox=624 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "15 Cep A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "15 Cep"
	Class           "B1V"
	AbsMagn         -3.17 // 计算的值
	MassKg          1.36108577039557e+31 // log(g) = 3.318 cm/s^2
	RadSol          9.5 // Gaia DR3
	LumBol          6411.00281370111 // 计算的值
	Teff            16757
	FeH             0.602

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.39527632
		Eccentricity    0.0819559767
		Inclination     -0.820111752
		AscendingNode   0
		ArgOfPericenter -39.826418
		MeanAnomaly     148.072006
	}
}

Star "15 Cep B"
{
	ParentBody      "15 Cep"
	Class           "B5.8?"
}