// Object * 90 Leo  ---  Double or Multiple Star  ---  OID=@1825306   (@@37925,0)  ---  coobox=13135 
// Object types: Double or Multiple Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=56473
Barycenter "90 Leo AB"
{
	ParentBody      "90 Leo"
	BinaryOrbit     
	{
		Separation      19493.5690668195 // 63.05 asec
	}
}

// Object * 90 Leo A  ---  Spectroscopic Binary  ---  OID=@1825307   (@@37925,1)  ---  coobox=13135 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "90 Leo A/Gaia DR3 3973470065974214784/TIC 67544478/ADS 8220 A/BD+17 2374A/CSI+17 2374 2/GCRV 7039/HD 100600A/HGAM 604/WDS J11347+1648A/PMSC 11295+1720A/PMSC 11295+1720Aab/TYC 1438-2840-1/UCAC4 534-051686/2MASS J11344248+1647488/SBC9 3035/Gaia DR2 3973470065974214784"
{
	ParentBody      "90 Leo AB"
	BinaryOrbit     
	{
		Separation      1075.93386253081 // 3.48 asec
	}
}

Star "90 Leo A1"
{
	DateUpdated     "2024-05-05"
	ParentBody      "90 Leo A"
	Parallax        3.2344
	AppMagn         6.289
	Class           "B6.6IV"
	AbsMagn         -1.16 // 计算的值
	MassKg          9.25307726932915e+30 // log(g) = 3.875 cm/s^2
	RadSol          4.125 // Gaia DR3
	LumBol          1369.05252958394 // 计算的值
	Teff            17287
	FeH             -1.217

	BinaryOrbit // ApJS 74 551 1990
	{
		PeriodDays      3.8209
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444181.800
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "90 Leo A2"
{
	ParentBody      "90 Leo A"
	Class           ""
	MassSol         0.56
}

// Object * 90 Leo B  ---  Star  ---  OID=@1825308   (@@37925,2)  ---  coobox=13135 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "90 Leo B/Gaia DR3 3973470065974214272/TIC 67544477/ADS 8220 B/BD+17 2374B/CSI+17 2374 3/GCRV 7040/HD 100600B/HGAM 605/WDS J11347+1648B/PMSC 11295+1720B/** STF 1552B/TYC 1438-2839-1/UCAC4 534-051685/2MASS J11344240+1647461/WEB 10148/Gaia DR2 3973470065974214272"
{
	DateUpdated     "2024-05-05"
	ParentBody      "90 Leo AB"
	Parallax        3.4212
	AppMagn         7.324
	Class           "B3.7V"
	AbsMagn         -0.01 // 计算的值
	MassSol         3.47
}

// Object BD+17 2373a  ---  Star  ---  OID=@1825305   (@@37924,14)  ---  coobox=13135 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+17 2373a/Gaia DR3 3973470031614733440/TIC 67544474/ADS 8220 C/AG+17 1226/CCDM J11347+1648C/GSC 01438-01842/HD 100600C/PPM 128361/SAO 99672/TYC 1438-1842-1/YZ 0 4460/2MASS J11343889+1647127/WDS J11347+1648C/PMSC 11295+1720C/Gaia DR2 3973470031613826560"
{
	DateUpdated     "2024-05-05"
	ParentBody      "90 Leo"
	Parallax        3.3177
	AppMagn         9.77
	Class           "F5"
	AbsMagn         2.37 // 计算的值
	MassKg          3.34409928743897e+30 // log(g) = 4.344 cm/s^2
	RadSol          1.445175 // Gaia DR3
	LumBol          11.4076596715247 // 计算的值
	Teff            8824
	FeH             -0.248
}

// Object * 88 Leo  ---  Double or Multiple Star  ---  OID=@1825758   (@@37932,8)  ---  coobox=13158 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Remove "88 Leo A" {ParentBody "88 Leo"}
Remove "88 Leo B" {ParentBody "88 Leo"}
Star "88 Leo A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "GJ 3669"
	Class           "F9.5V"
	AbsMagn         4.46
	MassSol         1.06
	RadSol          1.10
	LumBol          1.470
	Teff            6060
	FeH             -0.06
	RotationPeriod  343.68
	Age             5.7

	BinaryOrbit     
	{
		Separation      360.6
		PositionAngle   326
	}
}

Star "88 Leo B"
{
	ParentBody      "GJ 3669"
	Class           "G5"
	MassSol         0.74
}