// Object * 96 Vir  ---  Double or Multiple Star  ---  OID=@2243190   (@@47162,22)  ---  coobox=15764 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "96 Vir A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "96 Vir"
	Class           "K0III"
	AbsMagn         0.872 // 计算的值
	MassSol         2.28831218674972 // log(g) = 2.843 cm/s^2
	RadSol          9.490695 // Gaia DR3
	LumBol          60.8079907079968 // 计算的值
	Teff            5232
	FeH             -0.059

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.96637979
		Eccentricity    0.834625414
		Inclination     2.05035156
		AscendingNode   0
		ArgOfPericenter 105.013007
		MeanAnomaly     48.9155885
	}
}

Star "96 Vir B"
{
	ParentBody      "96 Vir"
	Class           "G7.5?"
}

// Object * mu. Vir  ---  High Proper Motion Star  ---  OID=@2295064   (@@48081,1)  ---  coobox=15730 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "MU Vir A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "MU Vir"
	Class           "F2V"
	AbsMagn         2.57
	MassKg          4.65740961987052e+30 // log(g) = 4.21 cm/s^2
	RadSol          1.99
	LumBol          7.474
	Teff            6751
	FeH             -0.05
	Age             1.5

	BinaryOrbit     
	{
		Separation      770
	}
}

// Object UCAC3 169-135909  ---  High Proper Motion Star  ---  OID=@8592859   (@@-1,255)  ---  coobox=15730 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC3 169-135909/Gaia DR3 6337717243069148032/TIC 185284202/2MASS J14430110-0539099/UCAC4 422-059850/DENIS J144301.1-053909/DENIS J144301.1-053910/** SKF 2126B/WDS J14431-0540B/Gaia DR2 6337717243069148032"
{
	ParentBody      "MU Vir"
	Class           "F8.1?"
}
