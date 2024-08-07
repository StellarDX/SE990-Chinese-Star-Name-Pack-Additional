// Object * 55 Leo  ---  High Proper Motion Star  ---  OID=@1770003   (@@36775,2)  ---  coobox=13242 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "55 Leo A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "55 Leo"
	Class           "F3/5V"
	AbsMagn         2.64 // 计算的值

	BinaryOrbit     
	{
		Separation      51.4416833073158 // 1.13 asec
	}
}

// Object * 55 Leo B  ---  High Proper Motion Star  ---  OID=@11607841   (@@-1,255)  ---  coobox=13242 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 

Star "55 Leo B/TYC 255-1197-2/** BU 1076B/ADS 7982 B/CCDM J10557+0044B/WDS J10557+0044B"
{
	DateUpdated     "2024-05-06"
	ParentBody      "55 Leo"
	Class           "K8.2?"
}

// Object * p02 Leo  ---  Variable Star  ---  OID=@1771737   (@@36791,20)  ---  coobox=14611 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "61 Leo A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "61 Leo"
	Class           "M0III"
	AbsMagn         -1.53
	MassKg          7.15732649043836e+30 // log(g) = 1.25 cm/s^2
	RadSol          74.5
	LumBol          1377.86
	Teff            3864
	FeH             0.07

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.16939706
		Eccentricity    0.116912594
		Inclination     2.39841271
		AscendingNode   0
		ArgOfPericenter 71.03023
		MeanAnomaly     75.7299206
	}
}

Star "61 Leo B"
{
	ParentBody      "61 Leo"
	Class           "WD?"
}

// Object * p04 Leo  ---  Red Giant Branch star  ---  OID=@1788523   (@@37147,19)  ---  coobox=13244 
// Object types: High Proper Motion Star,High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Variable Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "65 Leo A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "65 Leo"
	Class           "K0III"
	AbsMagn         5.8 // 计算的值

	BinaryOrbit     
	{
		Separation      162.981464311755 // 2.70 asec
	}
}

Star "65 Leo B"
{
	ParentBody      "65 Leo"
	Class           "K4.4?"
}