// Object * ksi Boo A  ---  High Proper Motion Star  ---  OID=@2302645   (@@48280,0)  ---  coobox=13820 
// Object types: Rotating Variable,High Proper Motion Star,Double or Multiple Star,Star,X-ray Source 
Remove "KSI Boo A"{ParentBody "KSI Boo"}
Remove "KSI Boo B"{ParentBody "KSI Boo"}
Star "KSI Boo A/GJ 566 A/TIC 1101124558/Gaia DR3 1237090738916392704/IDS 14468+1931 A/TYC 1481-722-1/CCDM J14513+1906A/8pc 149.26A/ADS 9413 A/BD+19 2870A/CSI+19 2870 4/HD 131156A/Zkh 212/WDS J14514+1906A/** STF 1888A/GCRV 8634/Gaia DR2 1237090738916392704"
{
	DateUpdated     "2024-05-23"
	ParentBody      "GJ 566"
	Parallax        148.0695
	AppMagn         4.675
	Class           "G7Ve"
	AbsMagn         5.54
	MassSol         0.88
	RadSol          0.817
	LumBol          0.562
	Teff            5545
	FeH             -0.10
	RotationPeriod  148.8
	Age             0.200

	BinaryOrbit     
	{
		Period          151.505
		Separation      33.1222858678482 // 4.9044 asec
		Eccentricity    0.5117
		Inclination     140.037
		AscendingNode   168.100
		Epoch           2418439.345742789097130
		ArgOfPericenter 203.917
		MeanAnomaly     0
	}
}

// Object * ksi Boo B  ---  High Proper Motion Star  ---  OID=@2302646   (@@48281,0)  ---  coobox=13820 
// Object types: Rotating Variable,High Proper Motion Star,Double or Multiple Star,Star 

Star "KSI Boo B/GJ 566 B/TIC 1101124559/Gaia DR3 1237090738916392832/IDS 14468+1931 B/TYC 1481-722-2/WDS J14514+1906B/8pc 149.26B/ADS 9413 B/BD+19 2870B/CCDM J14513+1906B/CSI+19 2870 5/GCRV 8635/GEN# +1.00131156B/HD 131156B/Zkh 213/** STF 1888B/WEB 12490/Gaia DR2 1237090738916392832"
{
	DateUpdated     "2024-05-23"
	ParentBody      "GJ 566"
	Parallax        148.1793
	AppMagn         6.816
	Class           "K5Ve"
	MassSol         0.66
	RadSol          0.61
	Luminosity      0.061
	Teff            4350
	RotationPeriod  276
}

// Object V* DE Boo  ---  RS CVn Variable  ---  OID=@2302338   (@@48279,7)  ---  coobox=13814 
// Object types: RS CVn Variable,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DE Boo A" {ParentBody "DE Boo"}
Remove "DE Boo B" {ParentBody "DE Boo"}
Star "HR 5553 A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "V* DE Boo"
	Class           "K0.5V"
	AbsMagn         5.69
	MassSol         0.84
	RadSol          0.86
	LumBol          0.498
	Teff            5313
	FeH             0.10
	RotationPeriod  249.6
	Age             0.7 // 1.3

	BinaryOrbit     
	{
		PeriodDays      125.396
		Separation      0.19
		Eccentricity    0.51
		Inclination     93.4
		AscendingNode   248.3
		ArgOfPericenter 39
		MeanAnomaly     0
	}
}

Star "HR 5553 B"
{
	DateUpdated     "2024-05-23"
	ParentBody      "V* DE Boo"
	Class           ""
	MassSol         0.45
}