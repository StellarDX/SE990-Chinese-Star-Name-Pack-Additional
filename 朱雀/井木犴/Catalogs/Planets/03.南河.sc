// Object * gam CMi  ---  Spectroscopic Binary  ---  OID=@971189   (@@18717,8)  ---  coobox=5847 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM CMi A" {ParentBody "GAM CMi"}
Remove "GAM CMi B" {ParentBody "GAM CMi"}
Star "GAM CMi A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "HIP 36284"
	Class           "K4III"
	AbsMagn         -0.5
	MassSol         1.88
	RadSol          36.8
	LumBol          321
	Teff            4036
	Age             1.3 

	BinaryOrbit     
	{
		PeriodDays      389.310
		Separation      5.45137213490786 // 17 mas
		Eccentricity    0.25856
		Inclination     66
		Epoch           2449849.172
		ArgOfPericenter 322.079
		MeanAnomaly     0
	}
}

Star "GAM CMi B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "HIP 36284"
	Class           "K1III"
	AbsMagn         1.7
	MassSol         1.85
	RadSol          7.8
	LumBol          25.4
	Teff            4658
}

// Object * eta CMi  ---  Star  ---  OID=@971505   (@@18375,14)  ---  coobox=5853 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ETA CMi A" {ParentBody "ETA CMi"}
Remove "ETA CMi B" {ParentBody "ETA CMi"}
Star "ETA CMi A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "HIP 36265"
	Class           "F0III"
	AbsMagn         0.1
	MassSol         2.16
	Radius          3120381.49281613 // 计算的值
	LumBol          57.5
	Teff            7505
	Age             0.818

	BinaryOrbit     
	{
		Period          5000
		Separation      440
	}
}

// Object * eta CMi B  ---  Star  ---  OID=@15318641   (@@-1,255)  ---  coobox=5853 
// Object types: Double or Multiple Star,Star 
Star "ETA CMi B/Gaia DR3 3142543427782668032/5 CMi B/** BU 21B/ADS 6101 B/CCDM J07280+0657B/HD 58923B/WDS J07280+0657B/Gaia DR2 3142543427782668032"
{
	DateUpdated     "2024-07-11"
	ParentBody      "HIP 36265"
	Class           "K1"
}

// Object * G CMi b  ---  Extra-solar Planet  ---  OID=@7885185   (@@-1,255)  ---  coobox=6073
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"G CMi b/HD 66141 b"
{
	ParentBody     "HD 66141"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	MassJup        6

	Orbit
	{
		Epoch           2451320.8
		PeriodDays      480.5
		SemiMajorAxis   1.2
		Eccentricity    0.07
		ArgOfPericen    22.1
	}
}

// Object HD 61563A  ---  Star  ---  OID=@15587967   (@@-1,255)  ---  coobox=6027 
// Object types: Double or Multiple Star,Star 
Star "HD 61563A/TYC 187-1206-1/CCDM J07401+0514A/** STF 1126A/WDS J07401+0514A/Gaia DR2 3138519829402291328"
{
	DateUpdated     "2024-07-15"
	ParentBody      "HD 61563"
	Parallax        4.9554
	AppMagn         6.55
	Class           "A0IV"
	AbsMagn         0.025 // 计算的值
	//MassSol         // log(g) = 4.08 cm/s^2
	RadSol          5.9
	LumBol          72
	Teff            9517

	BinaryOrbit     
	{
		Period          1516
		Separation      563.425858692909 // 2.792 asec
		Eccentricity    0.917
		Inclination     67.3
	}
}

// Object HD 61563B  ---  Star  ---  OID=@11615959   (@@-1,255)  ---  coobox=6027 
// Object types: Double or Multiple Star,Star 
Star "HD 61563B/TYC 187-1206-2/CCDM J07401+0514B/** STF 1126B/WDS J07401+0514B/Gaia DR2 3138519833701553152"
{
	DateUpdated     "2024-07-15"
	ParentBody      "HD 61563"
	Parallax        2.3276 // 光学伴星?
	AppMagn         6.96
	Class           "A0IV"
	AbsMagn         -1.2 // 计算的值
}
