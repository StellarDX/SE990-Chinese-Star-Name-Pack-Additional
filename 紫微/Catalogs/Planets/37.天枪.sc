Planet	"13 Boo b"
{
	ParentBody     "13 Boo"
	MassKg         5.694375e+28

	Orbit
	{
		PeriodDays      494
		SemiMajorAxis   1.25
		Eccentricity    0.21
	}
}

// Object * 24 Boo b  ---  Extra-solar Planet  ---  OID=@13310861   (@@-1,255)  ---  coobox=1504 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"24 Boo b"
{
	ParentBody     "24 Boo"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	MassKg         1.72729375e+27

	Orbit
	{
		Epoch           2450008.6
		PeriodDays      30.3506
		SemiMajorAxis   0.190
		Eccentricity    0.042
		ArgOfPericen    210
	}
}

// Object * 39 Boo A  ---  High Proper Motion Star  ---  OID=@516315   (@@9839,6)  ---  coobox=1437 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "39 Boo A/Gaia DR3 1590752742798813824/PLX 3355.1/ADS 9406 A/BD+49 2326A/CSI+49 2326 2/GCRV 8620/HD 131041A/WDS J14497+4843A/CCDM J14497+4843A/TYC 3477-1328-1/PMSC 14463+4907A/PLX 3355.10A/Gaia DR2 1590752742798813824"
{
	ParentBody      "39 Boo"
	BinaryOrbit     
	{
		Period          1347.653
		Separation      198.902727073012 // 2.9 asec
	}
}

Star "39 Boo Aa"
{
	DateUpdated     "2024-05-04"
	ParentBody      "39 Boo A"
	Class           "F8V"
	AbsMagn         2.53
	MassSol         1.29
	FeH             0.06
	Age             1.30

	BinaryOrbit     
	{
		PeriodDays      12.822
		Eccentricity    0.39
		Epoch           2422379.49
		ArgOfPericenter 277.1
		MeanAnomaly     0
	}
}

Star "39 Boo Ab"
{
	ParentBody      "39 Boo A"
	Class           ""
	MassSol         1.05
}

// Object * 39 Boo B  ---  Spectroscopic Binary  ---  OID=@516316   (@@9839,7)  ---  coobox=1437 
// Object types: Spectroscopic Binary,Double or Multiple Star,Star 
Star "39 Boo B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "39 Boo"
	Parallax        14.656
	AppMagn         6.62
	Class           "F7V"
	MassSol         1.25
}

// Object * i Boo A  ---  Eclipsing Binary  ---  OID=@515853   (@@10167,6)  ---  coobox=1429 
// Object types: Eclipsing Binary,Double or Multiple Star,High Proper Motion Star,Star 
Remove "44 Boo A" {ParentBody "44 Boo"}
Remove "44 Boo B" {ParentBody "44 Boo"}
Remove "44 Boo Ba" {ParentBody "44 Boo B"}
Remove "44 Boo Bb" {ParentBody "44 Boo B"}
Star "i Boo A/GJ 575 A/TIC 1102093577/WDS J15038+4739A/ASCC 332994/USNO-B1.0 1376-00310039/ADS 9494 A/BD+48 2259A/CCDM J15038+4739A/CSI+48 2259 2/GCRV 8727/LTT 14476/NLTT 39209/ROT 2144/TYC 3484-1580-1/LSPM J1503+4739E/** STF 1909A/PMSC 15005+4803A/44 Boo A/HD 133640A/Gaia DR2 1588936345294751872"
{
	DateUpdated     "2024-05-04"
	ParentBody      "HIP 73695"
	Class           "F5V"
	AbsMagn         2.211
	MassSol         1.04
	Radius          836006.475239032 // 计算的值
	LumBol          1.552
	Teff            5877
	FeH             -0.24
	Age             1.4 // 1.5
}

// Object * i Boo B  ---  Spectroscopic Binary  ---  OID=@515854   (@@10168,0)  ---  coobox=1429 
// Object types: Double or Multiple Star,High Proper Motion Star,Spectroscopic Binary,Star 
Barycenter "i Boo B/GJ 575 B/Gaia DR3 1588936345294751872/44 Boo B/ADS 9494 B/BD+48 2259B/CCDM J15038+4739B/CSI+48 2259 3/GCRV 8728/HD 133640B/LTT 14477/NLTT 39210/TYC 3484-1580-2/LSPM J1503+4739W/WDS J15038+4739B/** STF 1909B/PMSC 15005+4803B/WEB 12598/Gaia DR2 1588936555749388928/SBC7 529/SBC9 826"
{
	ParentBody      "HIP 73695"
	BinaryOrbit     
	{
		Period          209.8
		Separation      47.458778772022 // 3.666 asec
		Eccentricity    0.5111
		Inclination     83.55
		AscendingNode   57.14
		Epoch           2455942.049471423029900
		ArgOfPericenter 219.86
		MeanAnomaly     0
	}
}

Star "i Boo Ba"
{
	DateUpdated     "2024-05-04"
	ParentBody      "i Boo B"
	Class           "K0V"
	AbsMagn         5.38
	MassSol         0.98
	RadSol          0.87
	LumBol          0.51
	Teff            5300

	BinaryOrbit     
	{
		PeriodDays      0.267818
		Separation      0.00937069153083875 // 2.015 RSun
		Eccentricity    0.0
		Inclination     72.8
	}
}

Star "i Boo Bb"
{
	DateUpdated     "2024-05-04"
	ParentBody      "i Boo B"
	Class           "K4V"
	MassSol         0.55
	RadSol          0.66
	LumBol          0.24
	Teff            5035
}