// Object * 6 Equ  ---  Star  ---  OID=@1427461   (@@29732,4)  ---  coobox=9283 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "6 Equ A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "6 Equ"
	Class           "A2Va"
	AbsMagn         0.236
	MassSol         2.59
	RadSol          1.7
	LumBol          70.6
	Teff            9078
	Age             0.970

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   18.9855392
		Eccentricity    0.769402734
		Inclination     -1.85531807
		AscendingNode   0
		ArgOfPericenter 10.7394907
		MeanAnomaly     168.231301
	}
}

Star "6 Equ B"
{
	ParentBody      "6 Equ"
	Class           "F9.9?"
}

// Object * 18 Del b  ---  Extra-solar Planet  ---  OID=@4079753   (@@-1,255)  ---  coobox=20206 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet "18 Del b/HD 199665b/Arion"
{
	ParentBody     "Musica"
	DiscMethod     "RadVel"
	DiscDate       "2008"
	MassJup        10.3

	Orbit
	{
		Epoch           2451672
		PeriodDays      993.3
		SemiMajorAxis   2.6
		Eccentricity    0.08
		ArgOfPericen    166.1
	}
}