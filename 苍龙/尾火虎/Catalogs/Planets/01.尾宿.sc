// Object * mu.02 Sco b  ---  Extra-solar Planet Candidate  ---  OID=@19023362   (@@-1,255)  ---  coobox=16922
// Object types: Star,Extra-solar Planet Candidate
Remove "MU 2 Sco b" {ParentBody "MU 2 Sco"}
Planet "MU2 Sco b"
{
	ParentBody     "MU2 Sco"
	DiscMethod     "Imaging"
	DiscDate       "2022"
	MassJup        14.4

	Orbit
	{
		SemiMajorAxis   242.4
		Eccentricity    0.56
		Inclination     96.6
	}
}

Planet "MU2 Sco c"
{
	ParentBody     "MU2 Sco"
	DiscMethod     "Imaging"
	DiscDate       "2022"
	MassJup        18.5

	Orbit
	{
		SemiMajorAxis   18.9
		Eccentricity    0.61
		Inclination     62.8
	}
}

// Object * Q Sco  ---  High Proper Motion Star  ---  OID=@2347199   (@@53967,15)  ---  coobox=17050 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "Q Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "Q Sco"
	Class           "K0IIIb"
	AbsMagn         0.67
	MassSol         1.10
	RadSol          12.39
	LumBol          62.2
	Teff            4605
	FeH             -0.28

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   65.8128058
		Eccentricity    0.277158735
		Inclination     0.748803735
		AscendingNode   0
		ArgOfPericenter -98.6462355
		MeanAnomaly     -51.0892799
	}
}

Star "Q Sco B"
{
	ParentBody      "Q Sco"
	Class           "F2.1?"
}

// Object HD 162391  ---  Spectroscopic Binary  ---  OID=@2367754   (@@55013,17)  ---  coobox=17085 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Star 
Star "HD 162391 A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "HD 162391"
	Class           "G8III"
	AbsMagn         -1.59 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.971871967
		Eccentricity    0
		Inclination     -0.436229706
		AscendingNode   0
		ArgOfPericenter -91.5437783
		MeanAnomaly     -40.2474799
	}
}

Star "HD 162391 B"
{
	ParentBody      "HD 162391"
	Class           "A5.8?"
}