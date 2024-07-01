// Object * sig01 Tau  ---  Spectroscopic Binary  ---  OID=@719918   (@@19149,2)  ---  coobox=4897 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "SIG1 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "SIG1 Tau"
	Class           "A4m"
	AbsMagn         1.73
	MassSol         1.94
	Radius          1238702.49095477 // 计算的值
	LumBol          14.7
	Teff            8470

	BinaryOrbit     
	{
		PeriodDays      38.951
		Eccentricity    0.15
		Inclination     82
		Epoch           2443094.319
	}
}

Star "SIG1 Tau B"
{
	ParentBody      "SIG1 Tau"
	Class           "F1?"
}

// Object * 89 Tau  ---  Double or Multiple Star  ---  OID=@719296   (@@19662,3)  ---  coobox=4875 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source,UV-emission Source 
Star "89 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "89 Tau"
	Class           "F0V"
	AbsMagn         2.03 // 计算的值
	MassKg          2.85323449951221e+30 // log(g) = 3.74 cm/s^2
	RadSol          2.675775 // Gaia DR3
	LumBol          15.7458835434257 // 计算的值
	Teff            7029
	FeH             -0.534

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.12858306
		Eccentricity    0
		Inclination     -2.33796787
		AscendingNode   0
		ArgOfPericenter -114.132779
		MeanAnomaly     60.2931893
	}
}

Star "89 Tau B"
{
	ParentBody      "89 Tau"
	Class           "G3.7?"
}