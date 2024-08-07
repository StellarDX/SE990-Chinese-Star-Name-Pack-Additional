// Object * 40 Ari  ---  High Proper Motion Star  ---  OID=@1486274   (@@31058,10)  ---  coobox=12195 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "40 Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "40 Ari"
	Class           "K1III"
	AbsMagn         0.09
	MassSol         1.60
	RadSol          19.74
	LumBol          127.98
	Teff            4473
	FeH             -0.21
	Age             2.63

	BinaryOrbit     
	{
		Separation      27.3871550460028
	}
}

Star "40 Ari B"
{
	ParentBody      "40 Ari"
	Class           "F6.9?"
}

// Object * rho Ari  ---  High Proper Motion Star  ---  OID=@1486439   (@@31065,0)  ---  coobox=12203 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "RHO3 Ari A" {ParentBody "RHO3 Ari"}
Remove "RHO3 Ari B" {ParentBody "RHO3 Ari"}
Star "RHO3 Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "RHO Ari"
	Class           "F6V"
	AbsMagn         2.89
	Teff            6380
	FeH             0.23
	Age             2.4

	BinaryOrbit     
	{
		PeriodDays      3507
	}
}

Star "RHO3 Ari B"
{
	ParentBody      "RHO Ari"
	Class           "K0?"
}

// Object * eps Ari A  ---  Star  ---  OID=@1506520   (@@31554,0)  ---  coobox=12218 
// Object types: Double or Multiple Star,Star 
Remove "EPS Ari (AB)"{ParentBody "EPS Ari"}
Remove "EPS Ari C"{ParentBody "EPS Ari"}
Remove "EPS Ari A"{ParentBody "EPS Ari (AB)"}
Remove "EPS Ari B"{ParentBody "EPS Ari (AB)"} // C为光学伴星
Star "EPS Ari A/Gaia DR3 108589696800254464/48 Ari A/ADS 2257 A/AG+21 274/BD+20 484A/CCDM J02592+2120A/CSI+20 484 1/GC 3582/GCRV 1659/HD 18520/HR 888/N30 612/PPM 92122/SAO 75673/YPAC 306/WDS J02592+2120A/TYC 1230-1424-1/Renson 4640/WEB 2746/Gaia DR2 108589696800254464"
{
	DateUpdated     "2024-06-23"
	ParentBody      "EPS Ari"
	Parallax        9.0296
	AppMagn         5.16
	Class           "A2IV"
	AbsMagn         -0.06
	MassSol         2.4

	BinaryOrbit     
	{
		Period          704.111
		Separation      221.61080737462 // 2.174 asec
		Eccentricity    0.317
		Inclination     84.2
		AscendingNode   25.6
		Epoch           1978231.185661988798529
		ArgOfPericenter 342.1
		MeanAnomaly     0
	}
}

// Object * eps Ari B  ---  Star  ---  OID=@1506522   (@@31554,2)  ---  coobox=12218 
// Object types: Double or Multiple Star,Star 
Star "EPS Ari B/PLX 620/48 Ari B/ADS 2257 B/BD+20 484B/CCDM J02592+2120B/CSI+20 484 3/GCRV 1660/HD 18519/HR 887/IDS 02535+2056 B/ROT 398/SKY# 4488/PLX 620.00/WDS J02592+2120B/** STF 333B/Renson 4630/TYC 1230-1424-2/WEB 2745/Gaia DR2 108589696799636992"
{
	DateUpdated     "2024-06-23"
	ParentBody      "EPS Ari"
	Class           "A3IVs"
	MassSol         2.4
}
