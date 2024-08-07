// Object * lam Lib  ---  Spectroscopic Binary  ---  OID=@2508885   (@@49984,0)  ---  coobox=16599 
// Object types: Ellipsoidal Variable,Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "LAM Lib A" {ParentBody "LAM Lib"}
Remove "LAM Lib B" {ParentBody "LAM Lib"}
Star "LAM Lib A"
{
	DateUpdated     "2024-05-27"
	ParentBody      "HIP 77811"
	Class           "B3V"
	AbsMagn         0.56
	MassSol         5.01
	RadSol          3.9
	LumBol          743
	Teff            18700
	FeH             -0.27
	Age             0.282

	BinaryOrbit     
	{
		PeriodDays      14.4829
		Eccentricity    0.27
		Epoch           2435172.380
		ArgOfPericenter 37
		MeanAnomaly     0
	}
}

Star "LAM Lib B"
{
	ParentBody      "HIP 77811"
	Class           "A9.3?"
}

// Object * 2 Sco A  ---  Star  ---  OID=@11570388   (@@-1,255)  ---  coobox=16583 
// Object types: Double or Multiple Star,Star 
Star "2 Sco A/Gaia DR3 6235654766990811008/HD 142114A/CCDM J15536-2520A/** BU 36A/ADS 9823 A/WDS J15536-2520A/TYC 6782-2147-1/Gaia DR2 6235654766990811008"
{
	DateUpdated     "2024-05-27"
	ParentBody      "2 Sco"
	Parallax        7.0318
	AppMagn         4.71
	Class           "B2.5Vn"
	AbsMagn         -1.33
	MassSol         6.9
	Radius          1197000.73543177 // 计算的值
	LumBol          457.40
	Teff            20350
	Age             0.0304
	Oblateness      0.13043478260869565217391304347826

	BinaryOrbit     
	{
		Epoch           2456658
		Separation      293.097341702996 // 2.061 asec
		PositionAngle   268.28
	}
}

// Object * 2 Sco B  ---  Star  ---  OID=@11570389   (@@-1,255)  ---  coobox=16583 
// Object types: Double or Multiple Star,Star 
Star "2 Sco B/Gaia DR3 6235654762691937280/HD 142114B/CCDM J15536-2520B/** BU 36B/ADS 9823 B/WDS J15536-2520B/TYC 6782-2147-2/Gaia DR2 6235654762691937280"
{
	ParentBody      "2 Sco"
	Class           "B6.1?"
}