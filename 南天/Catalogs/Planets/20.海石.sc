// Object * a Car  ---  Spectroscopic Binary  ---  OID=@3101617   (@@66658,0)  ---  coobox=20904 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45080
Barycenter "HD 79351 Aa"
{
	ParentBody      "HD 79351"
	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   254.22417
		Eccentricity    0.287797966
		Inclination     -0.159780025
		AscendingNode   0
		ArgOfPericenter -141.72857
		MeanAnomaly     133.100106
	}
}

Star "HD 79351 Aa1"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 79351 Aa"
	Class           "B2IV-V"
	AbsMagn         -2.1 // 计算的值
	MassSol         9.15
	RadSol          5.0
	LumBol          5034.906900372403 // 计算的值
	Teff            21744
	Age             0.0187

	BinaryOrbit // SB9_561 1960MNRAS.121..263B
	{
		PeriodDays      6.7447
		Eccentricity    0.180
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2416534.215
		ArgOfPericenter 293.0
		MeanAnomaly     0
	}
}

Star "HD 79351 Aa2"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 79351 Aa"
	Class           ""
	MassSol         1.10
}

Star "HD 79351 Ab"
{
	ParentBody      "HD 79351"
	Class           "B5.7?"
}

// Object * c Car  ---  High Proper Motion Star  ---  OID=@3102284   (@@66664,11)  ---  coobox=21248 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 76728 A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 76728"
	Class           "B8II-III"
	AbsMagn         -1.12
	RadSol          5.0
	LumBol          449.05
	Teff            11880

	BinaryOrbit  // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.325792971
		Eccentricity    0
		Inclination     1.87052715
		AscendingNode   0
		ArgOfPericenter -155.032956
		MeanAnomaly     -174.341989
	}
}

Star "HD 76728 B"
{
	ParentBody      "HD 76728"
	Class           "B7.4?"
}