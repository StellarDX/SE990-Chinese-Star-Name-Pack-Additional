// Object * alf01 Cap  ---  Double or Multiple Star  ---  OID=@2577210   (@@61462,7)  ---  coobox=19345 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "ALF1 Cap A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF1 Cap"
	Class           "G3Ib"
	AbsMagn         -1.90
	MassSol         5.3
	RadSol          36.3
	LumBol          1047
	Teff            5119
	FeH             -0.02

	BinaryOrbit     
	{
		Separation      161.864984348285 // 0.65 asec
	}
}

Star "ALF1 Cap B"
{
	ParentBody      "ALF1 Cap"
	Class           "B7.5?"
}

// Object * nu. Cap  ---  Star  ---  OID=@2577330   (@@61893,0)  ---  coobox=19346 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "NU Cap A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "NU Cap"
	Class           "B9IV"
	AbsMagn         0.32
	MassSol         2.37
	Radius          1975551.63963064 // 计算的值
	LumBol          87
	Teff            10461
	FeH             -0.15
	Age             0.115

	BinaryOrbit     
	{
		Separation      4444.00632889583 // 54.1 asec
	}
}

Star "NU Cap B"
{
	ParentBody      "NU Cap"
	Class           "F5.5?" // 光学伴星?
}

// Object HD 192310b  ---  Extra-solar Planet  ---  OID=@5475434   (@@-1,255)  ---  coobox=19137
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "Gliese 785 b" {ParentBody "Gliese 785"}
Remove "Gliese 785 c" {ParentBody "Gliese 785"}
Planet	"GJ 785 b/HD 192310 b"
{
	ParentBody     "GJ 785"
	DiscMethod     "RadVel"
	DiscDate       "2011"
	Class          "IceGiant"
	Mass           16.1
	Radius         27238.452

	Orbit
	{
		Epoch           2455164.3
		PeriodDays      74.25
		SemiMajorAxis   0.32
		Eccentricity    0.11
		ArgOfPericen   -173.0
	}
}

// Object HD 192310c  ---  Extra-solar Planet  ---  OID=@6179241   (@@-1,255)  ---  coobox=19137
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"HD 192310 c"
{
	ParentBody     "GJ 785"
	DiscMethod     "RadVel"
	DiscDate       "2011"
	Class          "IceGiant"
	Mass           15.9
	Radius         33529.748

	Orbit
	{
		Epoch           2455151.02575
		PeriodDays      534.9
		SemiMajorAxis   1.21
		Eccentricity    0.06
		ArgOfPericen    110.0
	}
}