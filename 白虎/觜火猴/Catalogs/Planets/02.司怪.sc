// Object * 57 Ori  ---  Spectroscopic Binary  ---  OID=@839681   (@@20035,8)  ---  coobox=4951 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "57 Ori A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "57 Ori"
	Class           "B2V"
	AbsMagn         -3.04 // 计算的值
	MassKg          1.5985839249251e+31 // log(g) = 3.43 cm/s^2
	RadSol          9.05 // Gaia DR3
	LumBol          7444.1753410925 // 计算的值
	Teff            17822
	FeH             0.008

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.232081953
		Eccentricity    0.317944576
		Inclination     0.94786942
		AscendingNode   0
		ArgOfPericenter 143.301514
		MeanAnomaly     -120.874881
	}
}

Star "57 Ori B"
{
	ParentBody      "57 Ori"
	Class           "B6.2?"
}

// Object * 64 Ori  ---  Spectroscopic Binary  ---  OID=@856709   (@@20053,0)  ---  coobox=5634 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=28691
Barycenter "64 Ori A"
{
	ParentBody      "64 Ori"
	BinaryOrbit // VB6_Tok2022f MCA_24 Gr.3
	{
		Period          12.9884
		Separation      11.776309752288 // 0.045 asec
		Eccentricity    0.730
		Inclination     115.4
		AscendingNode   231.1
		Epoch           2444596.165808490477502
		ArgOfPericenter 305.3
		MeanAnomaly     0
	}
}

Star "64 Ori Aa"
{
	DateUpdated     "2024-07-05"
	ParentBody      "64 Ori A"
	Class           "B7III"
	AbsMagn         -1.96 // 计算的值
	MassKg          8.14719329871135e+30 // log(g) = 3.345 cm/s^2
	RadSol          7.125 // Gaia DR3
	LumBol          1086.55148875976 // 计算的值
	Teff            12415
	FeH             -0.939

	BinaryOrbit // SB9_375 2000AJ....119.2415S
	{
		PeriodDays      14.5721
		Eccentricity    0.387
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443164.188
		ArgOfPericenter 244.3
		MeanAnomaly     0
	}
}

Star "64 Ori Ab"
{
	DateUpdated     "2024-07-05"
	ParentBody      "64 Ori A"
	Class           "B8III"
	MassSol         4.20
}

Star "64 Ori B"
{
	DateUpdated     "2024-07-05"
	ParentBody      "64 Ori"
	Class           "B5V"
	MassSol         3.30
}

// Object * 68 Ori  ---  Double or Multiple Star  ---  OID=@870272   (@@20054,4)  ---  coobox=5638 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "68 Ori A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "68 Ori"
	Class           "B9.5V"
	AbsMagn         -1.8 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.353955558
		Eccentricity    0
		Inclination     0.66470933
		AscendingNode   0
		ArgOfPericenter -51.4923429
		MeanAnomaly     159.011336
	}
}

Star "68 Ori B"
{
	ParentBody      "68 Ori"
	Class           "A1.4?"
}