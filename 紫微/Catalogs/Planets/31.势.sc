// Object * 38 LMi  ---  Spectroscopic Binary  ---  OID=@1724881   (@@35858,11)  ---  coobox=12555 
// Object types: Spectroscopic Binary,Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "38 LMi A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "38 LMi"
	Class           "G0IV"
	AbsMagn         2.26
	MassSol         1.68
	Radius          2091629.59297063 // 计算的值
	LumBol          11.32
	Teff            6106
	FeH             0.32
	Age             2.03

	BinaryOrbit     
	{
		PeriodDays      7.7991499
		Eccentricity    0.023
		Epoch           2420165.164
		ArgOfPericenter 105.56
		MeanAnomaly     0
	}
}

Star "38 LMi B"
{
	ParentBody      "38 LMi"
	Class           ""
	MassSol         0.31
}

// Object * bet LMi  ---  Spectroscopic Binary  ---  OID=@1707131   (@@35497,0)  ---  coobox=12405 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "BET LMi A" {ParentBody "BET LMi"}
Remove "BET LMi B" {ParentBody "BET LMi"}
Star "BET LMi A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 51233"
	Class           "G9III"
	AbsMagn         0.85
	MassSol         2.98
	RadSol          9.4
	LumBol          50.7
	Teff            4097
	FeH             0.09
	Age             1.2

	BinaryOrbit     
	{
		PeriodDays      13965
		Separation      17.8486049647337 // 0.3782 asec
		Eccentricity    0.680
		Inclination     81.4
		Epoch           2451411.1
		ArgOfPericenter 35.7
		MeanAnomaly     0
	}
}

Star "BET LMi B"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 51233"
	Class           "F8IV"
	MassSol         1.92
	RadSol          3.7
	LumBol          9.1
	Teff            5211
}

// Object * 36 LMi  ---  Spectroscopic Binary  ---  OID=@1726537   (@@35896,25)  ---  coobox=12585 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "36 LMi A"
{
	DateUpdated     "2024-05-03"
	ParentBody      "36 LMi"
	Class           "K0III"
	AbsMagn         -2.18 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.52701991
		Eccentricity    0
		Inclination     1.09735382
		AscendingNode   0
		ArgOfPericenter 52.6487855
		MeanAnomaly     165.352775
	}
}

Star "36 LMi B"
{
	ParentBody      "36 LMi"
	Class           "B5.3?"
}

// Object * 44 LMi  ---  Spectroscopic Binary  ---  OID=@1746855   (@@36317,3)  ---  coobox=12687 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "44 LMi A"
{
	DateUpdated     "2024-05-03"
	ParentBody      "44 LMi"
	Class           "F3V"
	AbsMagn         1.39 // 计算的值
	MassKg          3.04814999282625e+30 // log(g) = 3.505 cm/s^2
	RadSol          3.624925 // Gaia DR3
	LumBol          25.5811295245021 // 计算的值
	Teff            6818
	FeH             -0.846

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.32680271
		Eccentricity    0.519198269
		Inclination     0.67467165
		AscendingNode   0
		ArgOfPericenter 82.2232593
		MeanAnomaly     -116.605159
	}
}

Star "44 LMi B"
{
	ParentBody      "44 LMi"
	Class           "K4.2?"
}
