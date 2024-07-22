// Object * mu. CMa A  ---  Star  ---  OID=@11632410   (@@-1,255)  ---  coobox=7369 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "MU CMa A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "MU CMa"
	Class           "K2III"
	AbsMagn         -2.22
	Teff            4441

	BinaryOrbit     
	{
		Epoch           2455563
		Separation      809.49128680689 // 计算的值
		PositionAngle   343.9
	}
}

// Object * mu. CMa B  ---  Star  ---  OID=@11606114   (@@-1,255)  ---  coobox=7369 
// Object types: Double or Multiple Star,Star 
Star "MU CMa B/Gaia DR3 2949326180717799040/TYC 5392-2413-1/ADS 5605 B/BD-13 1741B/CCDM J06561-1402B/CSI-13 1741 4/HD 51251/IDS 06515-1355 B/SKY# 12326/WDS J06561-1403B/** STF 997B/Gaia DR2 2949326180717799040"
{
	DateUpdated     "2024-07-21"
	ParentBody      "MU CMa"
	Parallax        3.4079
	AppMagn         7.12
	Class           "B9/A0V"
	AbsMagn         -0.22 // 计算的值
	MassSol         14.7
	Age             0.0116
}

// Object * gam CMa  ---  Star  ---  OID=@945511   (@@15076,12)  ---  coobox=7375 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "GAM CMa A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "GAM CMa"
	Class           "B8II"
	AbsMagn         -1.4
	MassKg          7.1914147592171e+30 // log(g) = 3.5 cm/s^2
	RadSol          5.6
	LumBol          715
	Teff            13596
	FeH             -0.24
	RotationPeriod  147.84

	BinaryOrbit
	{
		Separation      43.7880710307744
		PositionAngle   114.8
	}
}

Star "GAM CMa B"
{
	ParentBody      "GAM CMa"
	Class           "F5.7?"
}