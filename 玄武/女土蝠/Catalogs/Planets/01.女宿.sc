// Object * 12 Aqr A  ---  Double or Multiple Star  ---  OID=@1340447   (@@90557,1)  ---  coobox=8516 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=103981
Barycenter "12 Aqr A/Gaia DR3 6910418142353215104/WDS J21041-0549Aa,Ab/ADS 14592 A/BD-06 5664A/CCDM J21041-0549A/CSI-06 5664 2/GC 29417/GCRV 13234/HD 200497/HR 8059/PPM 204770/SAO 145065/SKY# 40051/WDS J21041-0549A/TYC 5204-1584-1/** MCA 66/** STF 2745A/PMSC 20588-0613A/PMSC 20588-0613Aab/WEB 18938/UCAC4 421-136870/Gaia DR2 6910418142353215104"
{
	ParentBody      "12 Aqr"
	BinaryOrbit     
	{
		Period          3348
		Separation      452.405730017048 // 2.47 asec
	}
}

Star "12 Aqr Aa"
{
	DateUpdated     "2024-06-08"
	ParentBody      "12 Aqr A"
	Class           "G4II"
	AbsMagn         0.1
	MassSol         2.6
	Teff            5012

	BinaryOrbit // VB6_Circ207 MCA_66Aa,Ab Gr.3
	{
		Period          84.2012
		Separation      35.3464491831859 // 0.193 asec
		Eccentricity    0.668
		Inclination     122.5
		AscendingNode   51.8
		Epoch           2446354.441753421910107
		ArgOfPericenter 183.4
		MeanAnomaly     0
	}
}

Star "12 Aqr Ab"
{
	DateUpdated     "2024-06-08"
	ParentBody      "12 Aqr A"
	Class           "A3+"
	AbsMagn         1.4
	MassSol         2.0
	Teff            8511
}

// Object * 12 Aqr B  ---  Star  ---  OID=@1340268   (@@27591,21)  ---  coobox=8516 
// Object types: Double or Multiple Star,Star 
Star "12 Aqr B/Gaia DR3 6910418146641915648/ADS 14592 B/BD-06 5664B/CCDM J21041-0549B/CSI-06 5664 1/GC 29416/HD 200496/HR 8058/SAO 145064/UBV M 25398/WDS J21041-0549B/TYC 5204-1584-2/** STF 2745B/PMSC 20588-0613B/UCAC4 421-136869/Gaia DR2 6910418146641915648"
{
	DateUpdated     "2024-06-08"
	ParentBody      "12 Aqr"
	Parallax        5.5929
	AppMagn         7.5
	Class           "A4"
	AbsMagn         1.5
	MassSol         1.9
	Teff            8318
}

// Object * 7 Aqr  ---  Star  ---  OID=@2593209   (@@62772,21)  ---  coobox=19390 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Star "7 Aqr A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "7 Aqr"
	Class           "K4III"
	AbsMagn         -0.61
	MassKg          6.85415539568658e+30 // log(g) = 1.650 asec
	RadSol          46
	LumBol          403.66
	Teff            3990
	FeH             -0.17

	BinaryOrbit     
	{
		Epoch           2452276
		Separation      417.362381414665
		PositionAngle   165
	}
}

// Object * 7 Aqr B  ---  Star  ---  OID=@15319032   (@@-1,255)  ---  coobox=19390 
// Object types: Double or Multiple Star,Star 
Star "7 Aqr B/Gaia DR3 6902502796793326720/** BU 1034B/ADS 14449 B/CCDM J20570-0941B/HD 199345A/WDS J20569-0942B/Gaia DR2 6902502796793326720"
{
	ParentBody      "7 Aqr"
	Class           "M0.7?"
}
