// Object * 40 LMi  ---  High Proper Motion Star  ---  OID=@1747277   (@@35950,6)  ---  coobox=12708 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "40 LMi A"
{
	DateUpdated     "2024-05-07"
	ParentBody      "40 LMi"
	Class           "A4Vn"
	AbsMagn         2.23
	MassSol         1.69
	RadSol          1.54
	LumBol          14.3
	Teff            7834
	FeH             -0.15
	Age             0.207

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   101.63375
		Eccentricity    0.0578767508
		Inclination     -0.490439892
		AscendingNode   0
		ArgOfPericenter 92.3846686
		MeanAnomaly     -136.996917
	}
}

Star "40 LMi B"
{
	ParentBody      "40 LMi"
	Class           "G2.7?"
}

// Object * 64 Leo  ---  Spectroscopic Binary  ---  OID=@1785069   (@@37086,4)  ---  coobox=12734 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "64 Leo A"
{
	DateUpdated     "2024-05-07"
	ParentBody      "64 Leo"
	Class           "A5m"
	AbsMagn         2.07 // 计算的值
	MassKg          2.96757985919532e+30 // log(g) = 4.093 cm/s^2
	RadSol          1.817532 // Gaia DR3
	LumBol          11.9544143777214 // 计算的值
	Teff            7961
	FeH             -0.874

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.029360617
		Eccentricity    0
		Inclination     -0.0326621532
		AscendingNode   0
		ArgOfPericenter 100.393801
		MeanAnomaly     2.1532722
	}
}

Star "64 Leo B"
{
	ParentBody      "64 Leo"
	Class           "F6?"
}